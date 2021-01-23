package cn.bif.patterns.iterator;


/**
 * @author Ted Wang
 * @created 2021/1/22 5:10 下午
 */
public interface Aggregate {
    /**
     * 描述 迭代器接口
     * @author Ted Wang
     * @created 2021/1/22 5:22 下午
     * @return  java.util.Iterator
     **/
    public abstract Iterator iterator() ;
    
    /**
     * 描述 获取容量
     * @author Ted Wang
     * @created 2021/1/23 7:42 下午
     * @param
     * @return  java.lang.Integer
     **/
    public abstract Integer getSize() ;
}
