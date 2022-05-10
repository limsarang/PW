package cn2;

import java.awt.AlphaComposite;
import java.util.*;
import javax.management.Descriptor;

class Basic {
	String allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";// ��� ���� ����

	boolean indexOfChar(char c)// char �迭�� ���� ���� Ȯ��
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
	char keyMatrix[][] = new char[5][5]; // 5x5 ũ�� ��Ļ���

	boolean repeat(char c)// �ߺ� �Ǵ� j�� �ִ��� Ȯ��
	{
		if (!b.indexOfChar(c))// ���ڰ� �ִ� ��� true�� �ݺ��ϰ� �Լ��� ��ȯ
		{
			return true;
		}

		for (int i = 0; i < keyMatrix.length; i++)// ���� j�� �̹� �����ϴ��� Ȯ��
		{
			for (int j = 0; j < keyMatrix[i].length; j++) {
				if (keyMatrix[i][j] == c)
					return true;
			}
		}
		return false;
	}

	void insertKey(String key)// Ű ����
	{
		key = key.toUpperCase();// �빮�� ��ȯ
		key = key.replaceAll("J", "I");// j ����
		key = key.replaceAll(" ", " ");// ���� ����
		int a = 0, b = 0;

		for (int k = 0; k < key.length(); k++) {
			if (!repeat(key.charAt(k)))// Ű�� �ݺ����� ������
			{
				keyMatrix[a][b++] = key.charAt(k);// matrix�� Ű ����
				if (b > 4)// ���� ������
				{
					b = 0;// �� �� ����
					a++;// ���� ������
				}
			}
		}
		
		// �ٸ� ���� �߰�
		char p = 'A';

		while (a < 5)// ��� �࿡
		{
			while (b < 5)// ��� ����
			{
				if (!repeat(p)) // p�ݺ� X
				{
					keyMatrix[a][b++] = p;// matrix�� ���� ����
				}
				p++;// ���� ���ڷ� �̵�
			}
			b = 0;// ù ��° ��
			a++;// ���� ��
		}

		// ��� Ű�� ����, ���ĺ� Ű�� �߰��� �� Matrix Ȯ�� 
		System.out.print("-------------------------Key Matrix-------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.print("\t" + keyMatrix[i][j]);
			}
		}
		System.out.println("\n---------------------------------------------------------");

	}

	int rowPos(char c)// c�� �� �������� �ǵ���
	{
		for (int i = 0; i < keyMatrix.length; i++)// matrix �� �ݺ�
		{
			for (int j = 0; j < keyMatrix[i].length; j++)// matrix �� �ݺ�
			{
				if (keyMatrix[i][j] == c)// Ű�� ���ڰ� ������ �� ��ġ�� ��ȯ
					return i;
			}
		}
		return -1;// ã�� ���Ͽ��� ��!
	}

	int columnPos(char c)// �� ��ġ ��ȯ
	{
		for (int i = 0; i < keyMatrix.length; i++) {
			for (int j = 0; j < keyMatrix[i].length; j++) {
				if (keyMatrix[i][j] == c)
					return j;// �� ��ġ
			}
		}
		return -1;
	}

	String encryptChar(String plain)// ��ȣȭ ���
	{
		plain = plain.toUpperCase();
		int r1, c1, r2, c2;
		String cipherChar = "";
		char a = plain.charAt(0), b = plain.charAt(1); // char�� ��ġ�� ���� char�� ��ġ�� ������
		// ��� ���� ��ġ�� ���� char�� ������
		r1 = rowPos(a);
		c1 = columnPos(a);
		r2 = rowPos(b);
		c2 = columnPos(b);

		if (c1 == c2)// �� ���ڰ� ���� ���̶��
		{
			++r1;// ���� ���� �������� ���� �����ϰ� �����Ͽ� �Ʒ��� ���ڸ� ����
			++r2;
			if (r1 > 4)// u�� ���� �ʰ��ϸ� ù ���� ������ �̵�
				r1 = 0;

			if (r2 > 4)// �� ��° ���ڵ� ����
				r2 = 0;
			cipherChar += keyMatrix[r1][c2];// ��ȣ���� �� ���� �߰�
			cipherChar += keyMatrix[r2][c1];
		} else if (r1 == r2)// ���� �� �ΰ��� ���� �ٿ� �ִٸ�
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
		if (len / 2 != 0)// ���� ���̰� �� ���� ������ ������ "X"�� ���� �κп� �߰�
		{
			plainText += "X";
			++len;
		}

		for (int i = 0; i < len - 1; i = i + 2)// ���� �� ���� �� ���� ���̰� ���������� �ݺ�
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
