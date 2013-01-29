/*
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, B3log Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.waibo.entry;

import java.util.Map;

import org.b3log.latke.plugin.AbstractPlugin;
import org.b3log.latke.servlet.HTTPRequestContext;

public class SNSWeiboPlugin extends AbstractPlugin {
	
	private static SNSWeiboPlugin weiboPlugin;
	
	public static SNSWeiboPlugin getInstance(){
		if(weiboPlugin == null) {
			weiboPlugin = new SNSWeiboPlugin();
		}
		return weiboPlugin;
	}

	private SNSWeiboPlugin(){
		
	}
	
	@Override
	public void prePlug(HTTPRequestContext context, Map<String, Object> args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void postPlug(Map<String, Object> dataModel,
			HTTPRequestContext context, Object ret) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void start() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub

	}

}
