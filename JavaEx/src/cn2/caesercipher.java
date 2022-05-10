
package cn2;

public class caesercipher {

	String plaintext = "";
	String CipherText = "";

	public String encrypt(String s) {
		plaintext = s;
		for (int i = 0; i < plaintext.length(); i++) {
			char ch = plaintext.charAt(i);

			if (Character.isLetter(ch)) {
				int ascii = (int) ch;

				if (Character.isUpperCase(ch)) {
					ascii += 3;

					if (ascii > 90) {
						ascii -= 26;
						ch = (char) ascii;
					}
					CipherText += ch;
				}

				if (Character.isLowerCase(ch)) {
					ascii += 3;

					if (ascii > 122) {
						ascii -= 26;
					}
					ch = (char) ascii;
					CipherText += ch;

				}
			} else {
				CipherText += ch;
			}
		}
		return CipherText;

	}

	public String decrypt(String s) {
		CipherText = "";

		CipherText = s;
		for (int i = 0; i < CipherText.length(); i++)

		{
			char ch = CipherText.charAt(i);
			if (Character.isLetter(ch)) {
				int ascii = (int) ch;

				if (Character.isUpperCase(ch)) {
					ascii -= 3;

					if (ascii < 65) {
						ascii += 26;
						ch = (char) ascii;
					}
					plaintext += ch;
				}

				if (Character.isLowerCase(ch)) {
					ascii -= 3;

					if (ascii < 97) {
						ascii += 26;
					}
					ch = (char) ascii;
					plaintext += ch;

				}
			} else {
				plaintext += ch;
			}
		}

		return plaintext;
	}

}
