package cn2;

public class cipherform extends javax.swing.JFrame {

	caesercipher c = new caesercipher();
	PlayFair p = new PlayFair();

	public cipherform() {
		initComponents();
	}
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="GeneratedCode">
	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		input = new javax.swing.JTextField();
		output = new javax.swing.JTextField();
		encrypt = new javax.swing.JButton();
		decrypt = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		ciphermethods = new javax.swing.JComboBox<>();
		jLabel4 = new javax.swing.JLabel();
		keyinput = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("다중 치환 암호화");
		setBackground(new java.awt.Color(255, 51, 51));
		setForeground(new java.awt.Color(255, 102, 0));

		jLabel2.setBackground(new java.awt.Color(255, 102, 102));
		jLabel2.setFont(new java.awt.Font("SanSerif", 1, 14)); 
		jLabel2.setForeground(new java.awt.Color(0, 0, 0));
		jLabel2.setText("평문");

		jLabel3.setBackground(new java.awt.Color(255, 102, 102));
		jLabel3.setFont(new java.awt.Font("SanSerif", 1, 14)); 
		jLabel3.setForeground(new java.awt.Color(0, 0, 0));
		jLabel3.setText("암호문");

		input.setFont(new java.awt.Font("SanSerif", 1, 14)); 
		input.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inputActionPerformed(evt);
			}
		});

		output.setFont(new java.awt.Font("Times New Roman", 1, 14));

		encrypt.setFont(new java.awt.Font("SanSerif", 1, 18)); 
		encrypt.setForeground(new java.awt.Color(0, 0, 0));
		encrypt.setText("암호");
		encrypt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				encryptActionPerformed(evt);
			}
		});

		decrypt.setFont(new java.awt.Font("SanSerif", 1, 18));
		decrypt.setForeground(new java.awt.Color(0, 0, 0));
		decrypt.setText("복호");
		decrypt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				decryptActionPerformed(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("SanSerif", 1, 18));
		jButton1.setForeground(new java.awt.Color(0, 0, 0));
		jButton1.setText("값 재설정");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("SanSerif", 1, 14));
		jLabel1.setForeground(new java.awt.Color(0, 0, 0));
		jLabel1.setText("암호 방식");

		jButton2.setFont(new java.awt.Font("SanSerif", 1, 18));
		jButton2.setForeground(new java.awt.Color(0, 0, 0));
		jButton2.setText("닫기");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		ciphermethods.setFont(new java.awt.Font("SanSerif", 1, 14)); 
		ciphermethods.setForeground(new java.awt.Color(0, 0, 0));
		ciphermethods.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "카이사르 암호", "쌍자음 암호", " ", " " }));
		ciphermethods.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ciphermethodsActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("SanSerif", 1, 14));
		jLabel4.setForeground(new java.awt.Color(0, 0, 0));
		jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel4MouseClicked(evt);
			}
		});

		keyinput.setFont(new java.awt.Font("SanSerif", 1, 14));
		keyinput.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				keyinputActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("SanSerif", 1, 14));
		jLabel5.setForeground(new java.awt.Color(0, 0, 0));
		jLabel5.setText("암호키");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(21, 21, 21)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(28, 28, 28)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, 552,
														Short.MAX_VALUE)
												.addComponent(output).addComponent(keyinput))
										.addGap(49, 49, 49))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(ciphermethods, javax.swing.GroupLayout.PREFERRED_SIZE, 161,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addGroup(layout.createSequentialGroup().addGap(96, 96, 96).addComponent(encrypt).addGap(18, 18, 18)
						.addComponent(decrypt).addGap(18, 18, 18).addComponent(jButton1).addGap(26, 26, 26)
						.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(jLabel4));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(18, 69, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
										.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(keyinput, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(ciphermethods, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(encrypt).addComponent(decrypt)
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		pack();
	}// </editor-fold>

	private void encryptActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			c.CipherText = "";
			c.plaintext = "";
			if (ciphermethods.getSelectedIndex() == 0)// caeser cihpher 암호화
			{
				output.setText(c.encrypt(input.getText()));
			}

			else if (ciphermethods.getSelectedIndex() == 1)// playfair 암호화
			{
				String key, plainText;
				plainText = input.getText();
				key = keyinput.getText();
				output.setText(p.Encrypt(plainText, key));
			} else if (ciphermethods.getSelectedIndex() == 2)
			{

			} else {
				input.setText("please choose a cipher method!!");
			}
		} catch (Exception e) {
			System.out.println("there's an erorr says :" + e);
		}

	}

	// decrypt button code
	private void decryptActionPerformed(java.awt.event.ActionEvent evt) {
		
		try {
			c.CipherText = "";
			c.plaintext = "";
			if (ciphermethods.getSelectedIndex() == 0)// caeser 해독
			{
				//output.setText(c.decrypt(input.getText()));
			} else if (ciphermethods.getSelectedIndex() == 1)// playfair 해독
			{

				String key, cipherText, plainText;
				cipherText = input.getText();
				key = keyinput.getText();
				plainText = p.Decrypt(cipherText, key);
				output.setText(plainText);

			} else if (ciphermethods.getSelectedIndex() == 2)// 해독
			{

			} else {
				input.setText("please choose a cipher method!!");
			}
		} catch (Exception e) {
			output.setText("can't decrypt used key and input value combination !");
		}

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		keyinput.setText("");
		input.setText("");
		output.setText("");
		c.CipherText = "";
		c.plaintext = "";
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void ciphermethodsActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void keyinputActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
	}
	
	private void inputActionPerformed(java.awt.event.ActionEvent evt) {
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(cipherform.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(cipherform.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(cipherform.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(cipherform.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>


		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new cipherform().setVisible(true);
			}
		});
	}

	// 변수 선언
	private javax.swing.JComboBox<String> ciphermethods;
	private javax.swing.JButton decrypt;
	private javax.swing.JButton encrypt;
	private javax.swing.JTextField input;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JTextField keyinput;
	private javax.swing.JTextField output;
	// 변수 선언 끝
}
