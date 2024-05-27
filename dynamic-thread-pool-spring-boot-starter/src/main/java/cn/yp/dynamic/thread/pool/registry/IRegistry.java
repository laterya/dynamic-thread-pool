package cn.yp.dynamic.thread.pool.registry;

import cn.yp.dynamic.thread.pool.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author yp
 * @description 注册中心接口
 * @create 2024/5/27 23:39
 */
public interface IRegistry {

    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
