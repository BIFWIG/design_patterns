package cn.bif.patterns.adapter;

/**
 * @author Ted Wang
 * @created 2021/1/23 8:04 下午
 */
public class Adapter implements NewInterface{
    
    /**
     * 旧的服务
     */
    OldService oldService;
    
    public Adapter (OldService oldService) {
        this.oldService = oldService;
    }
    
    /**
     * 描述 新得接口服务请求
     *
     * @return void
     * @author Ted Wang
     * @created 2021/1/23 8:03 下午
     **/
    @Override
    public void request () {
      oldService.execute();
    }
}
