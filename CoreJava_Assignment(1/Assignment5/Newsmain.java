package Assignment5;

import java.util.*;

public class Newsmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           List<News> list=new ArrayList<News>();
           News n1=new News(15,"kamal","hello","Budget morning");
           News n2=new News(21,"sai","hii","everything good");
           News n3=new News(15,"kamal","evening","Budget evening");
           News n4=new News(25,"john","sure","yess sir");
           list.add(n1);
           list.add(n2);
           list.add(n3);
           list.add(n4);
           list.stream()
           .filter(s->s.getComment().contains("Budget"))
           .forEach(c->System.out.println(c));
           System.out.println();
           News news=list.stream()
   				.max((a1,a2)->a1.getComment().length()-a2.getComment().length())
   				.get();
   		System.out.println(news.getNewsid());
           

}}
