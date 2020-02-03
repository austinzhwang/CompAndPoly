public class Person {
    //composition has-a relationship
    private Job job;
    private Education edu;

    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
        job.setRole("Teacher");
        this.edu = new Education();
        edu.addSchool("s1");
        edu.addSchool("s2");
        edu.addSchool("s3");
        edu.addSchool("s4");
        edu.addSchool("s5");
        edu.addSchool("s6");
        edu.addSchool("s7");
        edu.addSchool("s8");
        edu.addSchool("s9");
        edu.addSchool("s10");
    }
    public long getSalary() {
        return job.getSalary();
    }

    public String toString() {
        return job.toString() + "\n" + edu.toString();
    }
}