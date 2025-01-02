package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplArraylist implements CricketerService  {
    private CricketerService cricketerService;
    

    @Override
    public void deleteCricketer(int cricketerId) throws SQLException {
        // TODO Auto-generated method stub
        CricketerService.super.deleteCricketer(cricketerId);
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        CricketerService.super.emptyArrayList();
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) throws SQLException {
        // TODO Auto-generated method stub
        return CricketerService.super.getCricketerById(cricketerId);
    }

    @Override
    public List<Cricketer> getCricketersByTeam(int teamId) {
        // TODO Auto-generated method stub
        return CricketerService.super.getCricketersByTeam(teamId);
    }

    @Override
    public void updateCricketer(Cricketer cricketer) throws SQLException {
        // TODO Auto-generated method stub
        CricketerService.super.updateCricketer(cricketer);
    }

    @Override
    public List<Cricketer> getAllCricketers() {//throws SQLException {
        // TODO Auto-generated method stub
        //throw List;
        return null;

    }

    @Override
    public Integer addCricketer(Cricketer cricketer){//} throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCricketer'");
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {//throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCricketersSortedByExperience'");
    }
    

}