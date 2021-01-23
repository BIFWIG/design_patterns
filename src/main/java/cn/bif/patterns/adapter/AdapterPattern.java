package cn.bif.patterns.adapter;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

/**
 * @author Ted Wang
 * @created 2021/1/23 8:05 下午
 */
public class AdapterPattern {
    
    public static void main (String[] args) {
        
        NewInterface newInterface ;
        
        int type = 0;
        newInterface = execute(type);
        newInterface.request();
        
        
        type = 1;
        newInterface = execute(type);
        newInterface.request();
        
    
    }
    
    public static NewInterface execute(Integer type){
        if (type==1){
            // 新得服务
            return new NewInterfaceInstance();
        }else{
            //旧的服务
            return new Adapter(new OldService());
        }
    }
}
