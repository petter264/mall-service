package com.oruit.share.service;

import com.oruit.share.domain.TbUser;

import java.util.List;

public interface UserService {

    List<TbUser> queryUser(TbUser user);

    void insertTbUser(TbUser user);

    int updateTbUser(TbUser user);
}
