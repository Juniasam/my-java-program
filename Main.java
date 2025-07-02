import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		ArrayList<String> schedule = new ArrayList<String>();
		while(true){
		    System.out.print("1.Add\n2.Delete\n3.Get element\n4.Set elememt\n5.Size of Array\n6.Sort\n7.Display\n8.exit\n");
		    op = sc.nextInt();
		    String name;
		    if(op==1){
		        name = sc.next();
		        schedule.add(name);
		    }
		    else if(op==2){
		        name = sc.next();
		        schedule.remove(name);
		    }
		    else if(op==3){
		        int num = sc.nextInt();
		        schedule.get(num);
		    }
		    else if(op==4){
		        int num = sc.nextInt();
		        name = sc.next();
		        schedule.set(num,name);
		    }
		    else if(op==5){
		        System.out.print("Size of the array is "+schedule.size());
		        
		    }
		    
		    else if(op==6){
		        Collections.sort(schedule);
		    }
		    else if(op==7){
		        System.out.println(schedule);
		    }
		    else if(op==8){
		        return;
		    }
		    
		}
	}
}
