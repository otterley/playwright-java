/*
 * Copyright (c) Microsoft Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.playwright;

import com.microsoft.playwright.options.*;
import java.nio.file.Path;

/**
 * This API is used for the Web API testing. You can use it to trigger API endpoints, configure micro-services, prepare
 * environment or the service to your e2e test. When used on {@code Page} or a {@code BrowserContext}, this API will automatically use
 * the cookies from the corresponding {@code BrowserContext}. This means that if you log in using this API, your e2e test will be
 * logged in and vice versa.
 */
public interface APIRequestContext {
  class StorageStateOptions {
    /**
     * The file path to save the storage state to. If {@code path} is a relative path, then it is resolved relative to current
     * working directory. If no path is provided, storage state is still returned, but won't be saved to the disk.
     */
    public Path path;

    /**
     * The file path to save the storage state to. If {@code path} is a relative path, then it is resolved relative to current
     * working directory. If no path is provided, storage state is still returned, but won't be saved to the disk.
     */
    public StorageStateOptions setPath(Path path) {
      this.path = path;
      return this;
    }
  }
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/DELETE">DELETE</a> request and returns
   * its response. The method will populate request cookies from the context and update context cookies from the response.
   * The method will automatically follow redirects.
   *
   * @param url Target URL.
   */
  default APIResponse delete(String url) {
    return delete(url, null);
  }
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/DELETE">DELETE</a> request and returns
   * its response. The method will populate request cookies from the context and update context cookies from the response.
   * The method will automatically follow redirects.
   *
   * @param url Target URL.
   * @param params Optional request parameters.
   */
  APIResponse delete(String url, RequestOptions params);
  /**
   * All responses returned by {@link APIRequestContext#get APIRequestContext.get()} and similar methods are stored in the
   * memory, so that you can later call {@link APIResponse#body APIResponse.body()}. This method discards all stored
   * responses, and makes {@link APIResponse#body APIResponse.body()} throw "Response disposed" error.
   */
  void dispose();
  /**
   * Sends HTTP(S) request and returns its response. The method will populate request cookies from the context and update
   * context cookies from the response. The method will automatically follow redirects.
   *
   * @param urlOrRequest Target URL or Request to get all parameters from.
   */
  default APIResponse fetch(String urlOrRequest) {
    return fetch(urlOrRequest, null);
  }
  /**
   * Sends HTTP(S) request and returns its response. The method will populate request cookies from the context and update
   * context cookies from the response. The method will automatically follow redirects.
   *
   * @param urlOrRequest Target URL or Request to get all parameters from.
   * @param params Optional request parameters.
   */
  APIResponse fetch(String urlOrRequest, RequestOptions params);
  /**
   * Sends HTTP(S) request and returns its response. The method will populate request cookies from the context and update
   * context cookies from the response. The method will automatically follow redirects.
   *
   * @param urlOrRequest Target URL or Request to get all parameters from.
   */
  default APIResponse fetch(Request urlOrRequest) {
    return fetch(urlOrRequest, null);
  }
  /**
   * Sends HTTP(S) request and returns its response. The method will populate request cookies from the context and update
   * context cookies from the response. The method will automatically follow redirects.
   *
   * @param urlOrRequest Target URL or Request to get all parameters from.
   * @param params Optional request parameters.
   */
  APIResponse fetch(Request urlOrRequest, RequestOptions params);
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/GET">GET</a> request and returns its
   * response. The method will populate request cookies from the context and update context cookies from the response. The
   * method will automatically follow redirects.
   *
   * @param url Target URL.
   */
  default APIResponse get(String url) {
    return get(url, null);
  }
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/GET">GET</a> request and returns its
   * response. The method will populate request cookies from the context and update context cookies from the response. The
   * method will automatically follow redirects.
   *
   * @param url Target URL.
   * @param params Optional request parameters.
   */
  APIResponse get(String url, RequestOptions params);
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/HEAD">HEAD</a> request and returns its
   * response. The method will populate request cookies from the context and update context cookies from the response. The
   * method will automatically follow redirects.
   *
   * @param url Target URL.
   */
  default APIResponse head(String url) {
    return head(url, null);
  }
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/HEAD">HEAD</a> request and returns its
   * response. The method will populate request cookies from the context and update context cookies from the response. The
   * method will automatically follow redirects.
   *
   * @param url Target URL.
   * @param params Optional request parameters.
   */
  APIResponse head(String url, RequestOptions params);
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PATCH">PATCH</a> request and returns
   * its response. The method will populate request cookies from the context and update context cookies from the response.
   * The method will automatically follow redirects.
   *
   * @param url Target URL.
   */
  default APIResponse patch(String url) {
    return patch(url, null);
  }
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PATCH">PATCH</a> request and returns
   * its response. The method will populate request cookies from the context and update context cookies from the response.
   * The method will automatically follow redirects.
   *
   * @param url Target URL.
   * @param params Optional request parameters.
   */
  APIResponse patch(String url, RequestOptions params);
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/POST">POST</a> request and returns its
   * response. The method will populate request cookies from the context and update context cookies from the response. The
   * method will automatically follow redirects.
   *
   * @param url Target URL.
   */
  default APIResponse post(String url) {
    return post(url, null);
  }
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/POST">POST</a> request and returns its
   * response. The method will populate request cookies from the context and update context cookies from the response. The
   * method will automatically follow redirects.
   *
   * @param url Target URL.
   * @param params Optional request parameters.
   */
  APIResponse post(String url, RequestOptions params);
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT">PUT</a> request and returns its
   * response. The method will populate request cookies from the context and update context cookies from the response. The
   * method will automatically follow redirects.
   *
   * @param url Target URL.
   */
  default APIResponse put(String url) {
    return put(url, null);
  }
  /**
   * Sends HTTP(S) <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT">PUT</a> request and returns its
   * response. The method will populate request cookies from the context and update context cookies from the response. The
   * method will automatically follow redirects.
   *
   * @param url Target URL.
   * @param params Optional request parameters.
   */
  APIResponse put(String url, RequestOptions params);
  /**
   * Returns storage state for this request context, contains current cookies and local storage snapshot if it was passed to
   * the constructor.
   */
  default String storageState() {
    return storageState(null);
  }
  /**
   * Returns storage state for this request context, contains current cookies and local storage snapshot if it was passed to
   * the constructor.
   */
  String storageState(StorageStateOptions options);
}

