/*
 * Copyright 2013 Shazam Entertainment Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
*/
package com.shazam.gwen.tasks;

/**
 * This interface defines an assertion to be performed with the help of an object of type {@link T}. If the assertion
 * fails, usually a runtime exception is thrown.
 * @param <T> The type of the object used with the assertion.
 */
public interface Assertion<T> {

    void assertWith(T objectUsedToPerformAssertion);
}