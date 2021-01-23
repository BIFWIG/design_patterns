package cn.bif.patterns.iterator;

/**
 * @author Ted Wang
 * @created 2021/1/22 5:27 下午
 */
public class ClassRoom implements Aggregate {
    /**
     * 实际数组
     */
    private Student[] students;
    /**
     * 已存在数量/下标
     */
    private Integer last = 0;
    
    public ClassRoom (Integer size) {
        this.students = new Student[size];
    }
    
    public void addStudent (Student student) {
        this.students[last] = student;
        last++;
    }
    
    public Student getStudent (Integer index) {
        
        return students[index];
    }
    
    @Override
    public Integer getSize(){
        return this.last;
    }
    /**
     * 描述 迭代器接口
     *
     * @return java.util.Iterator
     * @author Ted Wang
     * @created 2021/1/22 5:22 下午
     **/
    @Override
    public Iterator iterator () {
        return new ClassRoomIterator(this);
    }
}
