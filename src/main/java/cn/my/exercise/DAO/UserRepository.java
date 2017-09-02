package cn.my.exercise.DAO;

import cn.my.exercise.Entity.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer>{
    List<User> findByName(String name);

    @Query(value = "SELECT * FROM user WHERE age = ?1 AND name = ?2",nativeQuery = true)
    List<User> findByMe(int age,String name);
    //使用query注解自己定义一个接口，这时候当你调用这个接口的时候，会完全执行！@query中的value。请注意@Query注解默认的value类型是JSQL语言而不是原生SQL语言，因此我们需要设置nativeQuery为true变成原生的SQL语言
    //这里的1，2都是代表传入参数的位置
}


