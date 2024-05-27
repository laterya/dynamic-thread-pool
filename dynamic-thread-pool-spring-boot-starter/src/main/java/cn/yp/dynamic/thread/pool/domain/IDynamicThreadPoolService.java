package cn.yp.dynamic.thread.pool.domain;

import cn.yp.dynamic.thread.pool.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author yp
 * @description 动态线程池服务
 * @create 2024/5/27 22:20
 */
public interface IDynamicThreadPoolService {
    List<ThreadPoolConfigEntity> queryThreadPoolList();

    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);

}
