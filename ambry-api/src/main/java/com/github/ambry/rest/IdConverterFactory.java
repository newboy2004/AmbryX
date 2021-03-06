/**
 * Copyright 2016 LinkedIn Corp. All rights reserved.
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
 */
package com.github.ambry.rest;

/**
 * IdConverterFactory is a factory to generate all the supporting cast required to instantiate a {@link IdConverter}.
 * <p/>
 * Usually called with the canonical class name and as such might have to support appropriate (multiple) constructors.
 */
public interface IdConverterFactory {

  /**
   * Returns an instance of the {@link IdConverter} that the factory generates.
   * @return an instance of {@link IdConverter} generated by this factory.
   * @throws InstantiationException if the {@link IdConverter} instance cannot be created.
   */
  public IdConverter getIdConverter() throws InstantiationException;
}
