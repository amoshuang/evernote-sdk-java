package com.evernote.auth;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EvernoteAuthTest {

  String response;
  EvernoteAuth auth;

  @Before
  public void initialize() {
    response = "oauth_token=S%3Ds4%3AU%3Da1%3AE%3D12bfd68c6b6%3AC%3D12bf8426ab8%3AP%3D7%3AA%3Den_oauth_test%3AH%3D3df9cf6c0d7bc410824c80231e64dbe1&oauth_token_secret=&edam_noteStoreUrl=https%3A%2F%2Fsandbox.evernote.com%2Fshard%2Fs1%2Fnotestore&edam_userId=161&edam_webApiUrlPrefix=https%3A%2F%2Fsandbox.evernote.com%2Fshard%2Fs1%2F";
    auth = new EvernoteAuth(EvernoteService.SANDBOX, response);
  }

  @Test
  public void testExtractNoteStoreUrl() {
    assertEquals("https://sandbox.evernote.com/shard/s1/notestore",
        auth.extractNoteStoreUrl(response));
  }

  @Test
  public void testExtractWebApiUrl() {
    assertEquals("https://sandbox.evernote.com/shard/s1/",
        auth.extractWebApiUrl(response));
  }

  @Test
  public void testExtractUserId() {
    assertEquals("161", auth.extractUserId(response));
  }

}
