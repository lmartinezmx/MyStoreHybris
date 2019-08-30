/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package mx.myhybris.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import mx.myhybris.fulfilmentprocess.constants.MyhybrisFulfilmentProcessConstants;

public class MyhybrisFulfilmentProcessManager extends GeneratedMyhybrisFulfilmentProcessManager
{
	public static final MyhybrisFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MyhybrisFulfilmentProcessManager) em.getExtension(MyhybrisFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}