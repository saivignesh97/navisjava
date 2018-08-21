import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CreateUsers {

    public static void main(String[] args) {

        User user1 = new User("user1", "user1@navis.com");
        User user2 = new User("user2", "user2@navis.com");
        User user3 = new User("user3", "user3@navis.com");
        User user4 = new User("user4", "user4@navis.com");
        User user5 = new User("user5", "user5@navis.com");



        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        List<User> subList = list.subList(0,3);
        System.out.println(subList.size());
        subList.add(new User("user6","ihsadh@gmail.com") );
        //list.remove(5);
        subList.remove(2);
        System.out.println(subList.size());
        System.out.println(list.size());
        //User userArray[] = new User[5];
      /*  ArrayList<User> userList = new ArrayList<>();
        List<User> userList1 = new ArrayList<>();
        Collection<User> userList2 = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
      //  userList.add(new String("Hello"));
        userList.add(user4);
        userList.add(user5);


        Object oref = userList.get(1);
       /* if (userList.get(2) instanceof User) {
*

            System.out.println(ref.getUserName());
        }


        User ref = (User) userList.get(2);

        Iterator<User> it =  userList.iterator();
        while(it.hasNext())
        {

            System.out.println(it.next().getUserName());

        }

        for(User u:userList)
        {
            System.out.println(u.getUserName());

        }*/
    }
}
