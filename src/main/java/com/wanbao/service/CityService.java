package com.wanbao.service;

import com.github.pagehelper.PageHelper;
import com.wanbao.mapper.CityMapper;
import com.wanbao.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanbao on 2017/3/19.
 */
@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public List<City> getAll(City city){
        if(city.getPage()!=null && city.getRows()!=null){
            PageHelper.startPage(city.getPage(),city.getRows());
        }
        return cityMapper.selectAll();
    }

    public City getCityById(Integer id){
        return cityMapper.selectByPrimaryKey(id);
    }

    public void deleteCityById(Integer id){
        cityMapper.deleteByPrimaryKey(id);
    }

    public void save(City city){
        if(city.getId()!=null){
            cityMapper.updateByPrimaryKey(city);
        }else{
            cityMapper.insert(city);
        }
    }
}
