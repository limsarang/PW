package cn2;

import java.awt.AlphaComposite;
import java.util.*;
import javax.management.Descriptor;

class Basic {
	String allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";// 모든 글자 생성

	boolean indexOfChar(char c)// char 배열에 존재 유무 확인
	{
		for (int i = 0; i < allChar.length(); i++) {
			if (allChar.charAt(i) == c)
				return true;
		}
		return false;
	}
}

class PlayFair {
	Basic b = new Basic();
	char keyMatrix[][] = new char[5][5]; // 5x5 크기 행렬생성

	boolean repeat(char c)// 중복 또는 j가 있는지 확인
	{
		if (!b.indexOfChar(c))// 문자가 있는 경우 true를 반복하고 함수로 반환
		{
			return true;
		}

		for (int i = 0; i < keyMatrix.length; i++)// 문자 j가 이미 존재하는지 확인
		{
			for (int j = 0; j < keyMatrix[i].length; j++) {
				if (keyMatrix[i][j] == c)
					return true;
			}
		}
		return false;
	}

	void insertKey(String key)// 키 삽입
	{
		key = key.toUpperCase();// 대문자 변환
		key = key.replaceAll("J", "I");// j 제거
		key = key.replaceAll(" ", " ");// 공백 제거
		int a = 0, b = 0;

		for (int k = 0; k < key.length(); k++) {
			if (!repeat(key.charAt(k)))// 키가 반복되지 않으면
			{
				keyMatrix[a][b++] = key.charAt(k);// matrix에 키 삽입
				if (b > 4)// 열이 끝나면
				{
					b = 0;// 새 열 시작
					a++;// 다음 행으로
				}
			}
		}
		
		// 다른 문자 추가
		char p = 'A';

		while (a < 5)// 모든 행에
		{
			while (b < 5)// 모든 열에
			{
				if (!repeat(p)) // p반복 X
				{
					keyMatrix[a][b++] = p;// matrix에 문자 삽입
				}
				p++;// 다음 문자로 이동
			}
			b = 0;// 첫 번째 열
			a++;// 다음 행
		}

		// 모든 키의 문자, 알파벳 키를 추가한 후 Matrix 확인 
		System.out.print("-------------------------Key Matrix-------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.print("\t" + keyMatrix[i][j]);
			}
		}
		System.out.println("\n---------------------------------------------------------");

	}

	int rowPos(char c)// c의 행 포지션을 되돌림
	{
		for (int i = 0; i < keyMatrix.length; i++)// matrix 행 반복
		{
			for (int j = 0; j < keyMatrix[i].length; j++)// matrix 열 반복
			{
				if (keyMatrix[i][j] == c)// 키랑 문자가 같으면 행 위치를 반환
					return i;
			}
		}
		return -1;// 찾지 못하였을 때!
	}

	int columnPos(char c)// 열 위치 반환
	{
		for (int i = 0; i < keyMatrix.length; i++) {
			for (int j = 0; j < keyMatrix[i].length; j++) {
				if (keyMatrix[i][j] == c)
					return j;// 열 위치
			}
		}
		return -1;
	}

	String encryptChar(String plain)// 암호화 방법
	{
		plain = plain.toUpperCase();
		int r1, c1, r2, c2;
		String cipherChar = "";
		char a = plain.charAt(0), b = plain.charAt(1); // char의 위치와 다음 char의 위치를 가져옴
		// 행과 열의 위치와 다음 char을 가져옴
		r1 = rowPos(a);
		c1 = columnPos(a);
		r2 = rowPos(b);
		c2 = columnPos(b);

		if (c1 == c2)// 두 문자가 같은 열이라면
		{
			++r1;// 다음 행을 가져오고 열을 동일하게 유지하여 아래의 문자를 얻음
			++r2;
			if (r1 > 4)// u가 행을 초과하면 첫 번재 행으로 이동
				r1 = 0;

			if (r2 > 4)// 두 번째 글자도 같이
				r2 = 0;
			cipherChar += keyMatrix[r1][c2];// 암호문에 새 문자 추가
			cipherChar += keyMatrix[r2][c1];
		} else if (r1 == r2)// 만약 이 두개가 같은 줄에 있다면
		{
			++c1;
			++c2;
			if (c1 > 4)
				c1 = 0;

			if (c2 > 4)
				c2 = 0;
			cipherChar += keyMatrix[r1][c1];
			cipherChar += keyMatrix[r2][c2];

		} else {
			cipherChar += keyMatrix[r1][c2];
			cipherChar += keyMatrix[r2][c1];
		}
		return cipherChar;
	}

	String decryptChar(String cipher) {

		cipher = cipher.toUpperCase();
		char a = cipher.charAt(0), b = cipher.charAt(1);
		String plainChar = "";
		int r1, c1, r2, c2;
		r1 = rowPos(a);
		c1 = columnPos(a);
		r2 = rowPos(b);
		c2 = columnPos(b);

		if (c1 == c2) {
			--r1;
			--r2;
			if (r1 < 0)
				r1 = 4;

			if (r2 < 0)
				r2 = 4;
			plainChar += keyMatrix[r1][c2];
			plainChar += keyMatrix[r2][c1];
		} else if (r1 == r2) {
			--c1;
			--c2;
			if (c1 < 0)
				c1 = 4;

			if (c2 < 0)
				c2 = 4;
			plainChar += keyMatrix[r1][c1];
			plainChar += keyMatrix[r2][c2];

		} else {
			plainChar += keyMatrix[r1][c2];
			plainChar += keyMatrix[r2][c1];
		}
		return plainChar;
	}

	String Encrypt(String plainText, String key) {
		insertKey(key);
		String cipherText = "";
		plainText = plainText.replaceAll("j", "i");
		plainText = plainText.replaceAll(" ", "");
		plainText = plainText.toUpperCase();
		int len = plainText.length();
		// System.out.println(plainText.substring(1,2+1));
		if (len / 2 != 0)// 평문의 길이가 두 개로 나뉘지 않으면 "X"를 다음 부분에 추가
		{
			plainText += "X";
			++len;
		}

		for (int i = 0; i < len - 1; i = i + 2)// 평문을 한 번에 두 개로 줄이고 끝날때까지 반복
		{
			cipherText += encryptChar(plainText.substring(i, i + 2));
			cipherText += " ";
		}
		return cipherText;
	}

	String Decrypt(String cipherText, String key) {

		String plainText = "";
		cipherText = cipherText.replaceAll("j", "i");
		cipherText = cipherText.replaceAll(" ", " ");
		cipherText = cipherText.toUpperCase();
		int len = cipherText.length();
		for (int i = 0; i < len - 1; i = i + 2) {
			plainText += decryptChar(cipherText.substring(i, i + 2));
			plainText += " ";

		}
		return plainText;
	}

}
