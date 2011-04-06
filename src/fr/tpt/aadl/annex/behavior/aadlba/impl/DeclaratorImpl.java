/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the Eclipse Public License as published by Eclipse,
 * either version 1.0 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see 
 * http://www.eclipse.org/org/documents/epl-v10.php
 */

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tpt.aadl.annex.behavior.aadlba.impl;

import fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage;
import fr.tpt.aadl.annex.behavior.aadlba.Declarator;
import fr.tpt.aadl.annex.behavior.aadlba.Identifier;
import fr.tpt.aadl.annex.behavior.aadlba.IntegerValueConstant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.DeclaratorImpl#getIdentifierOwned <em>Identifier Owned</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.DeclaratorImpl#getArraySizes <em>Array Sizes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclaratorImpl extends ElementImpl implements Declarator {
	/**
	 * The cached value of the '{@link #getIdentifierOwned() <em>Identifier Owned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierOwned()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifierOwned;

	/**
	 * The cached value of the '{@link #getArraySizes() <em>Array Sizes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySizes()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerValueConstant> arraySizes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlBaPackage.Literals.DECLARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifierOwned() {
		return identifierOwned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifierOwned(Identifier newIdentifierOwned, NotificationChain msgs) {
		Identifier oldIdentifierOwned = identifierOwned;
		identifierOwned = newIdentifierOwned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AadlBaPackage.DECLARATOR__IDENTIFIER_OWNED, oldIdentifierOwned, newIdentifierOwned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifierOwned(Identifier newIdentifierOwned) {
		if (newIdentifierOwned != identifierOwned) {
			NotificationChain msgs = null;
			if (identifierOwned != null)
				msgs = ((InternalEObject)identifierOwned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AadlBaPackage.DECLARATOR__IDENTIFIER_OWNED, null, msgs);
			if (newIdentifierOwned != null)
				msgs = ((InternalEObject)newIdentifierOwned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AadlBaPackage.DECLARATOR__IDENTIFIER_OWNED, null, msgs);
			msgs = basicSetIdentifierOwned(newIdentifierOwned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlBaPackage.DECLARATOR__IDENTIFIER_OWNED, newIdentifierOwned, newIdentifierOwned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerValueConstant> getArraySizes() {
		if (arraySizes == null) {
			arraySizes = new EObjectContainmentEList.Unsettable<IntegerValueConstant>(IntegerValueConstant.class, this, AadlBaPackage.DECLARATOR__ARRAY_SIZES);
		}
		return arraySizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArraySizes() {
		if (arraySizes != null) ((InternalEList.Unsettable<?>)arraySizes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArraySizes() {
		return arraySizes != null && ((InternalEList.Unsettable<?>)arraySizes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AadlBaPackage.DECLARATOR__IDENTIFIER_OWNED:
				return basicSetIdentifierOwned(null, msgs);
			case AadlBaPackage.DECLARATOR__ARRAY_SIZES:
				return ((InternalEList<?>)getArraySizes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AadlBaPackage.DECLARATOR__IDENTIFIER_OWNED:
				return getIdentifierOwned();
			case AadlBaPackage.DECLARATOR__ARRAY_SIZES:
				return getArraySizes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AadlBaPackage.DECLARATOR__IDENTIFIER_OWNED:
				setIdentifierOwned((Identifier)newValue);
				return;
			case AadlBaPackage.DECLARATOR__ARRAY_SIZES:
				getArraySizes().clear();
				getArraySizes().addAll((Collection<? extends IntegerValueConstant>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AadlBaPackage.DECLARATOR__IDENTIFIER_OWNED:
				setIdentifierOwned((Identifier)null);
				return;
			case AadlBaPackage.DECLARATOR__ARRAY_SIZES:
				unsetArraySizes();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AadlBaPackage.DECLARATOR__IDENTIFIER_OWNED:
				return identifierOwned != null;
			case AadlBaPackage.DECLARATOR__ARRAY_SIZES:
				return isSetArraySizes();
		}
		return super.eIsSet(featureID);
	}

} //DeclaratorImpl
