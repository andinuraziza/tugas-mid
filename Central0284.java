/*Andi Nur Aziza Abbas
 * 13020210284
 */
package central0284;
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0284 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0284 obj = new Central0284 ();
        System.out.println("main");
        obj.aaa();
    }
}