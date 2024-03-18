package com.xworkz.MallShopMngt.Service.impl;

import com.xworkz.MallShopMngt.Service.MallService;
import com.xworkz.MallShopMngt.dto.MallDTO;
import com.xworkz.MallShopMngt.repository.MallRepository;
import com.xworkz.MallShopMngt.repository.impl.MallRepositoryIMpl;

public class MallServiceImpl implements MallService {

    MallRepository mallRepository;

    public MallServiceImpl() {
        mallRepository = new MallRepositoryIMpl();
    }

    @Override
    public boolean validateAndAddMall(MallDTO mall) {
        if (mall != null) {
            mallRepository.addMall(mall);
            return true;
        }
        return false;
    }
}
