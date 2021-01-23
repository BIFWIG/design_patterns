package cn.bif.patterns.adapter;

/**
 * 其他新接口的实例
 * @author Ted Wang
 * @created 2021/1/23 8:11 下午
 */
public class NewInterfaceInstance implements NewInterface{
    /**
     * 描述 新得接口服务请求
     *
     * @return void
     * @author Ted Wang
     * @created 2021/1/23 8:03 下午
     **/
    @Override
    public void request () {
        System.out.println("新接口新实例实现的方法");
    }
}
