# testmongo
springBoot测试示例
1,测试mongo自定义主键入库。主键不冲突的情况下可以入库。


附：save和insert方法的区别。
插入重复数据
　　insert: 若新增数据的主键已经存在，则会抛 org.springframework.dao.DuplicateKeyException 异常提示主键重复，不保存当前数据。
　　save: 若新增数据的主键已经存在，则会对当前已经存在的数据进行修改操作。

批操作
　　insert: 可以一次性插入一整个列表，而不用进行遍历操作，效率相对较高
　　save: 需要遍历列表，进行一个个的插入


————————————————
版权声明：本文为CSDN博主「豪豪豪Hilox」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/Dh_Chao/article/details/78812433
