package cn.bif.patterns.iterator;

/**
 * @author Ted Wang
 * @created 2021/1/22 5:23 下午
 */
public interface Iterator {
    /**
     * 描述 是否有下一个元素
     *
     * @return boolean
     * @author Ted Wang
     * @created 2021/1/22 5:23 下午
     **/
    public abstract boolean hasNext ();
    
    /**
     * 描述 下一个元素
     *
     * @return java.lang.Object
     * @author Ted Wang
     * @created 2021/1/22 5:23 下午
     **/
    public abstract Object next ();
    
}
