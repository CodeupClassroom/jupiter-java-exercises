package annotationsLecture;

public class Child extends Parent {
    @Override
    public void sayHello(){
        System.out.println("Hello from child class!");
    }

    /**
     * @deprecated Use newMethod instead {@link #imAMethod()}
     */
    @Deprecated
    public void deprecatedMethod(){
        System.out.println("I'm a deprecated method!");
    }

    public void imAMethod(){
        System.out.println("I'm a method!");
    }
}
