package net.sppan.base.service.specification;

import java.util.ArrayList;
import java.util.List;

import net.sppan.base.service.specification.SpecificationOperator.Join;

import org.springframework.data.jpa.domain.Specification;

public class SimpleSpecificationBuilder<T> {

    /**
     * 条件列表
     */
    private List<SpecificationOperator> opers;

    /**
     * 构造函数，初始化的条件是and
     */
    public SimpleSpecificationBuilder(String key,String oper,Object value) {
        SpecificationOperator so = new SpecificationOperator();
        so.setJoin(Join.and.name());
        so.setKey(key);
        so.setOper(oper);
        so.setValue(value);
        opers = new ArrayList<SpecificationOperator>();
        opers.add(so);
    }

    public SimpleSpecificationBuilder() {
        opers = new ArrayList<SpecificationOperator>();
    }

    /**
     * 完成条件的添加
     * @return
     */
    public SimpleSpecificationBuilder<T> add(String key,String oper,Object value,String join) {
        SpecificationOperator so = new SpecificationOperator();
        so.setKey(key);
        so.setValue(value);
        so.setOper(oper);
        so.setJoin(join);
        opers.add(so);
        return this;
    }


    /**
     * 添加or条件的重载
     * @return this，方便后续的链式调用
     */
    public SimpleSpecificationBuilder<T> addOr(String key,String oper,Object value) {
        return this.add(key,oper,value,Join.or.name());
    }

    /**
     * 添加and的条件
     * @return
     */
    public SimpleSpecificationBuilder<T> add(String key,String oper,Object value) {
        return this.add(key,oper,value,Join.and.name());
    }


    public Specification<T> generateSpecification() {
        Specification<T> specification = new SimpleSpecification<T>(opers);
        return specification;
    }
}