package com.greenfoxacademy.restpractice.services;


import com.greenfoxacademy.restpractice.models.Log;

import java.util.List;

public interface LogService {
  void addLog(Log log);

  List<Log> getAllLogs();
}
