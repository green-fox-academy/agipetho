package com.greenfoxacademy.restpractice.services;

import com.greenfoxacademy.restpractice.models.Log;
import com.greenfoxacademy.restpractice.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {

  private LogRepository logRepository;

  @Autowired
  public LogServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void addLog(Log log) {
    logRepository.save(log);
  }

  @Override
  public List<Log> getAllLogs() {
    List<Log> listOfLogs = new ArrayList<>();
    logRepository.findAll().forEach(log -> listOfLogs.add(log));
    return listOfLogs;
  }
}

