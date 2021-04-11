package team.gym.Beans;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
    TODO 客户等级是否使用枚举类，还是简单的使用字符串？
使用枚举代码有更高的可读性，但是处理可能较复杂  ——课程类型也有同样问题,返回值状态码
使用枚举拓展性更强，使用字符串易出错
    TODO course保存方式
-保存于customer和trainer类中，一个数据需保存两次，空间换时间，但是不易扩展
-全部保存于一个文件中，xml格式无法检索，只能遍历
*/
@Component
@XmlRootElement(name = "customer")
public class Customer extends User{
    // different level of membership
    // Newbie —— Registered —— Advanced —— Respectful —— VIP —— Honorable
    private final StringProperty  level = new SimpleStringProperty();

    // XmLElementWrapper generates a wrapper element around XML representation
    @XmlElementWrapper(name = "CourseList")
    // XmlElement sets the name of the entities
    @XmlElement(name = "course")
    private List<Course> courses = new LinkedList<Course>();

    public Customer(){
        super();
        setAccount(String.valueOf(new Random().nextInt(94)));
        setPassword("ipassword");
        setName("iname");
        setGender("it");
        setLocation("ilocation");
        setPhone("138");
        setEmail("iemail");
        setLevel("Newbie");
    }

    public String getLevel() {
        return level.get();
    }

    public StringProperty levelProperty() {
        return level;
    }

    public void setLevel(String level) {
        this.level.set(level);
    }
    @XmlTransient
    public List<Course> getCourses() { return courses; }

    public void setCourses(List<Course> courses) { this.courses = courses; }


}
