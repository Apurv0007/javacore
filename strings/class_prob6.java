//                   .........................(String BUFFER).........................
package strings;

public class class_prob6 {

	public static void main(String[] args) {
		StringBuffer st=new StringBuffer("we love jharkhand");
       int l;
       System.out.println("String is :"+st);
       l=st.length();
       System.out.println("Length of string is :"+l);
       System.out.println("after append :"+st.append(" and india"));
       System.out.println("after insert :"+st.insert(8, " Ranchi "));
       System.out.println("after replace :"+st.replace(4, 6, "ik"));
       System.out.println("after delete :"+st.delete(19, 24));
       System.out.println("sub string :"+st.substring(4, 9));
       System.out.println("reverse :"+st.reverse());
       System.out.println("reverse :"+st.reverse());
       System.out.println("String is :"+st);

	}

}
