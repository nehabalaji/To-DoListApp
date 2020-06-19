package com.workshop.starterapp.database;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.paging.PagedList;

import com.workshop.starterapp.data.Task;

public class TaskRepository {

    private TaskDao taskDao;
    private int pageSize = 15;
    private TaskRepository INSTANCE = null;

    public TaskRepository(Application application){
        TaskDatabase taskDatabase = TaskDatabase.getDatabase(application);
        taskDao = taskDatabase.taskDao();
    }

    public TaskRepository getRepository(Application application){
        if(INSTANCE == null){
            synchronized (TaskRepository.class){
                if(INSTANCE==null){
                    INSTANCE = new TaskRepository(application);
                }
            }
        }
        return INSTANCE;
    }
}
