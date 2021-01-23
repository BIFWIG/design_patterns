package cn.bif.patterns.iterator;

/**
 * @author Ted Wang
 * @created 2021/1/22 5:29 下午
 */
public class ClassRoomIterator implements Iterator{
    /**
     * 迭代器遍历对象
     */
    private ClassRoom classRoom;
    
    /**
     * 已遍历索引号
     */
    private Integer index;
    
    
    public ClassRoomIterator (ClassRoom classRoom) {
        this.classRoom = classRoom;
        index = 0;
    }
    

    
    /**
     * 描述 是否有下一个元素
     *
     * @return boolean
     * @author Ted Wang
     * @created 2021/1/22 5:23 下午
     **/
    @Override
    public boolean hasNext () {
        return classRoom.getSize() > index;
    }
    
    /**
     * 描述 下一个元素
     *
     * @return java.lang.Object
     * @author Ted Wang
     * @created 2021/1/22 5:23 下午
     **/
    @Override
    public Object next () {
        Student student = classRoom.getStudent(index);
        index++;
        return student;
    }
}
