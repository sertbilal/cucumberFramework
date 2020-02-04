package com.study_methods;

public class Repl127 {
//	public static void main(String[] args) {
		
	
	public static void main(String[] args) {
		Repl127 main=new Repl127();
	   System.out.println(main.privateAccess()+", "+ main.defaultAccess()+", "+ main.protectedAccess()+", "+ main.publicAccess());
	  }
	  private String privateAccess(){
	    String str="private";
	    return str;
	  }
	  
	   String defaultAccess(){
	    String str="default";
	    return str;
	  }
	  
	    protected String protectedAccess(){
	    String str="protected";
	    return str;
	  }
	    public String publicAccess(){
	    String str="public";
	    return str;
	  }
	}
//Benimki calismadi
//	private String pri() {
//		String a="private";
//		  return a;
//		}
//		String def() {
//			String b="default";
//		  return b;
//		}  
//		protected String pro() {
//			String c="protected";
//		  return c;
//		}
//		public String pub() {
//		  String d="public";
//		  return d;
//		}
//
//	public static void main1 (String []args) {
//		  Repl127 m=new Repl127();
////		   m.pri();
////		   m.def();
////		   m.pro();
////		   m.pub();
//	  System.out.println(m.pri()+","+m.def()+","+m.pro()+","+m.pub());
		  
//		}}
		