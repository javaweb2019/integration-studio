/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
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
package org.wso2.integrationstudio.gmf.esb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>WS Client Side Broadcast Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.wso2.integrationstudio.gmf.esb.EsbPackage#getWSClientSideBroadcastLevel()
 * @model
 * @generated
 */
public enum WSClientSideBroadcastLevel implements Enumerator {
    /**
     * The '<em><b>Zero</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ZERO_VALUE
     * @generated
     * @ordered
     */
    ZERO(0, "zero", "0"),

    /**
     * The '<em><b>One</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ONE_VALUE
     * @generated
     * @ordered
     */
    ONE(1, "one", "1"),

    /**
     * The '<em><b>Two</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TWO_VALUE
     * @generated
     * @ordered
     */
    TWO(2, "two", "2");

    /**
     * The '<em><b>Zero</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Zero</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ZERO
     * @model name="zero" literal="0"
     * @generated
     * @ordered
     */
    public static final int ZERO_VALUE = 0;

    /**
     * The '<em><b>One</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>One</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ONE
     * @model name="one" literal="1"
     * @generated
     * @ordered
     */
    public static final int ONE_VALUE = 1;

    /**
     * The '<em><b>Two</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Two</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TWO
     * @model name="two" literal="2"
     * @generated
     * @ordered
     */
    public static final int TWO_VALUE = 2;

    /**
     * An array of all the '<em><b>WS Client Side Broadcast Level</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WSClientSideBroadcastLevel[] VALUES_ARRAY = new WSClientSideBroadcastLevel[] {
            ZERO,
            ONE,
            TWO,
        };

    /**
     * A public read-only list of all the '<em><b>WS Client Side Broadcast Level</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<WSClientSideBroadcastLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>WS Client Side Broadcast Level</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WSClientSideBroadcastLevel get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            WSClientSideBroadcastLevel result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>WS Client Side Broadcast Level</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WSClientSideBroadcastLevel getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            WSClientSideBroadcastLevel result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>WS Client Side Broadcast Level</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WSClientSideBroadcastLevel get(int value) {
        switch (value) {
            case ZERO_VALUE: return ZERO;
            case ONE_VALUE: return ONE;
            case TWO_VALUE: return TWO;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private WSClientSideBroadcastLevel(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} // WSClientSideBroadcastLevel
