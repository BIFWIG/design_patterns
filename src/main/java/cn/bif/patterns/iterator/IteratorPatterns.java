package cn.bif.patterns.iterator;

/**
 * @author Ted Wang
 * @created 2021/1/23 7:44 下午
 */
public class IteratorPatterns {
    public static void main (String[] args) {
        ClassRoom classRoom = new ClassRoom(10);
        classRoom.addStudent(        new Student("a"));
        classRoom.addStudent(        new Student("b"));
        classRoom.addStudent(        new Student("c"));
    
        Iterator iterator = classRoom.iterator();
        while (iterator.hasNext()){
            System.out.println(((Student) iterator.next()).getName());
        }
    
    
    }
}
