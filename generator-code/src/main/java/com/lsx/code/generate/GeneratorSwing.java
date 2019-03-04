package com.lsx.code.generate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 作者:liweiwei
 * @date 2017年7月20日上午10:19:33
 * @version V1.0
 * @Description:
 *
 */
public class GeneratorSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("代码生成界面");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		

		// 设置窗口的大小和位置
		f.setSize(400, 800);
		f.setLocation(200, 200);
		
		Container con = f.getContentPane();// 生成一个容器
		con.setLayout(new GridLayout(7, 1));

		JPanel pan1 = new JPanel();// 生成一个新的版面
		JLabel title = new JLabel("代码生成窗口");
		title.setFont(new Font("宋体", Font.BOLD, 20));
		pan1.add(title);
		con.add(pan1);


		JPanel pan2 = new JPanel();// 生成一个新的版面
		JLabel database = new JLabel("数据库名");
		pan2.add(database);
		final TextField databaseName = new TextField(20);
		databaseName.setText("");
		pan2.add(databaseName);
		con.add(pan2);
		
		JPanel pan3 = new JPanel();// 生成一个新的版面
		JLabel user = new JLabel("用户名");
		pan3.add(user);
		final TextField userName = new TextField(20);
		userName.setText("");
		pan3.add(userName);
		con.add(pan3);
		
		JPanel pan4 = new JPanel();// 生成一个新的版面
		JLabel pwd = new JLabel("密码");
		pan4.add(pwd);
		final TextField password = new TextField(20);
		password.setText("");
		pan4.add(password);
		con.add(pan4);
		
		JPanel pan5 = new JPanel();// 生成一个新的版面
		JLabel pack = new JLabel("包名");
		pan5.add(pack);
		final TextField packName = new TextField(20);
		packName.setText("");
		pan5.add(packName);
		con.add(pan5);
	

		JPanel pan6 = new JPanel();// 生成一个新的版面
		JLabel table = new JLabel("表名");
		pan6.add(table);
		final TextField tableName = new TextField(20);
		tableName.setText("");
		pan6.add(tableName);
		con.add(pan6);

		JPanel pan7 = new JPanel();// 生成一个新的版面
		JLabel project = new JLabel("项目简称");
		pan7.add(project);
		final TextField projectName = new TextField(20);
		projectName.setText("");
		pan7.add(projectName);
		con.add(pan7);

		JPanel pan8 = new JPanel();// 生成一个新的版面
		JLabel application = new JLabel("微服务名称");
		pan8.add(application);
		final TextField applicationName = new TextField(20);
		applicationName.setText("");
		pan8.add(applicationName);
		con.add(pan8);

		JPanel pan9 = new JPanel();
		JButton b_log = new JButton("生成代码1");
		pan9.add(b_log);
		con.add(pan9);
	
		
		f.setVisible(true);
		//增加监听事件，点击时生成代码
		b_log.addActionListener(new ActionListener(){  

				public void actionPerformed(ActionEvent e) {
	            	EntityGeneratorClient.generateCode(databaseName.getText(),userName.getText(),password.getText(),packName.getText(),tableName.getText(),projectName.getText(),applicationName.getText());
	            }});  
	}

}