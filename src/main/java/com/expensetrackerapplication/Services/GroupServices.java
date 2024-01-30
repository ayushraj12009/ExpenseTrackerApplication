package com.expensetrackerapplication.Services;

import com.expensetrackerapplication.Repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServices {

    @Autowired
    private GroupRepository groupRepository;

}
