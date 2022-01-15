package com.company;
import com.company.dao.UserDao;
import com.company.model.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
      User user1 = new User(1);
      User user2 = new User(2);
      User user3 = new User(3);

      User user4 = new User("azho",19);
      User user5 = new User("almaz",14);
      User user6 = new User("murtaz",16);

        User[] userDaos = {user1,user2,user3};
        User[]userDaos1 = {user4,user5,user6};
        System.out.println(user1);
        for (User a: userDaos) {
            System.out.println(a);
        }
        for (User b : userDaos1) {
            System.out.println(b);
        }
    }
}
