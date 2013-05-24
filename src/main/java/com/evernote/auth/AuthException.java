package com.evernote.auth;

/**
 * Default scribe exception. Represents a problem in the OAuth signing process
 * 
 * @author Kentaro Suzuki
 */
public class AuthException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  /**
   * Default constructor
   * 
   * @param message
   *          message explaining what went wrong
   * @param e
   *          original exception
   */
   AuthException(String message, Exception e) {
    super(message, e);
  }

  /**
   * No-exception constructor. Used when there is no original exception
   * 
   * @param message
   *          message explaining what went wrong
   */
  AuthException(String message) {
    super(message, null);
  }

}