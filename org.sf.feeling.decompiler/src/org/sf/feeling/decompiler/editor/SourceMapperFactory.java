/*******************************************************************************
 * Copyright (c) 2016 Chen Chao(cnfree2000@hotmail.com).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Chen Chao  - initial API and implementation
 *******************************************************************************/

package org.sf.feeling.decompiler.editor;

import org.sf.feeling.decompiler.jad.JadSourceMapper;
import org.sf.feeling.decompiler.jdcore.JDCoreSourceMapper;

public class SourceMapperFactory
{

	private static DecompilerSourceMapper jadSourceMapper;
	private static DecompilerSourceMapper jdCoreSourceMapper;
	private static DecompilerSourceMapper cfrSourceMapper;

	public static DecompilerSourceMapper getSourceMapper( String decompiler )
	{
		if ( DecompilerType.JAD.equals( decompiler ) )
		{
			if ( jadSourceMapper == null )
			{
				jadSourceMapper = new JadSourceMapper( );
			}
			return jadSourceMapper;
		}
		else if ( DecompilerType.JDCORE.equals( decompiler ) )
		{
			if ( jdCoreSourceMapper == null )
			{
				jdCoreSourceMapper = new JDCoreSourceMapper( );
			}
			return jdCoreSourceMapper;
		}
		else if ( DecompilerType.CFR.equals( decompiler ) )
		{
			if ( cfrSourceMapper == null )
			{
				cfrSourceMapper = new JDCoreSourceMapper( );
			}
			return cfrSourceMapper;
		}
		return null;
	}
}
