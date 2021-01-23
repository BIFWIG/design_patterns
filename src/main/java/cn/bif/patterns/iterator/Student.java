package cn.bif.patterns.iterator;

/**
 * @author Ted Wang
 * @created 2021/1/22 5:24 下午
 */
public class Student {
    
    /**
     * 学生名
     */
    private String name;
    
    public Student (String name) {
        this.name = name;
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
}
