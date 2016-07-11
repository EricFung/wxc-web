var ioc = {
        dataSource : {
            type : "com.alibaba.druid.pool.DruidDataSource",
            events : {
                create : "init",
                depose : 'close'
            },
            fields : {
                url : "jdbc:sqlserver://192.168.0.198:1433;databaseName=hbshweb",
                username : "hbshweb",
                password : "hbsh1234"
            }
        },
        dao : {
            type : "org.nutz.dao.impl.NutDao",
            args : [{refer:"dataSource"}]
        }
};