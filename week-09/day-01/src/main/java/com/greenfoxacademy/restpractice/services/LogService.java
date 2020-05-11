package com.greenfoxacademy.restpractice.services;


import com.greenfoxacademy.restpractice.models.Log;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LogService {
  void addLog(Log log);
  List<Log> getAllLogs();
}
