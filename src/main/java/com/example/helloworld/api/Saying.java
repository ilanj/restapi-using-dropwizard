package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import lombok.Data;
import org.apache.commons.lang3.RandomUtils;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.UUID;
@Data
public class Saying {
    @JsonProperty

    private Integer id;
    private String s1;

//    @Length(max = 3)
//    private String content;

    public static ArrayList<Saying> addData(ArrayList<Saying> s)
    {
        Saying say=new Saying();

        say.setId(1);
        say.setS1("aaaa");
        s.add(say);
        Saying say2=new Saying();
        say2.setId(2);
        say2.setS1("bbbb");
        s.add(say2);
        Saying say3=new Saying();

        say3.setId(3);
        say3.setS1("cccc");
        s.add(say3);
        return s;
    }

    public static ArrayList<Saying> postData(Saying say4,ArrayList<Saying> s)
    {

        s.add(say4);
        return s;

    }
    public static ArrayList<Saying> putData(Saying say5,ArrayList<Saying> s)
    {
        int flag=0;
        for(Saying sa:s)
        {
            if(say5.getId()==sa.getId())
            {
                sa.setS1(say5.getS1());
                flag=1;

            }
        }
        if(flag==0)
            s.add(say5);
        return s;
    }
    public static ArrayList<Saying> deleteData(int id,ArrayList<Saying> s)
    {
        int flag=0;
        int len=s.size();
        for(int i=0;i<len;i++)
        {
            if(id==s.get(i).getId())
            {
                s.remove(i);
                flag=1;
                break;
            }
        }

        return s;
    }

    public static ArrayList<Saying> patchData(Saying say5,ArrayList<Saying> s)
    {
        int flag=0;
        for(Saying sa:s)
        {
            if(say5.getId()==sa.getId())
            {
                flag=1;

                if(say5.getS1()!=null)
                sa.setS1(say5.getS1());
                

            }
        }
        if(flag==0)
            s.add(say5);
        return s;
    }

}