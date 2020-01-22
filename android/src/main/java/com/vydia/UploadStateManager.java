package com.vydia.RNUploader;

import java.util.HashMap;

class UploadStateManager {
  private HashMap<String, Integer> uploadProgress;
  UploadStateManager() {
    this.uploadProgress = new HashMap<String, Integer>();
  }

  int getUploadProgress(String uploadId) {
    if (this.uploadProgress.containsKey(uploadId)) {
      return this.uploadProgress.get(uploadId).intValue();
    }
    return -1;
  }

  void setUploadProgress(String uploadId, Integer progress) {
    if (this.uploadProgress.containsKey(uploadId)) {
      this.uploadProgress.replace(uploadId, progress);
    } else {
      this.uploadProgress.put(uploadId, progress);
    }
  }

  void removeUploadProgress(String uploadId) {
    this.uploadProgress.remove(uploadId);
  }
}