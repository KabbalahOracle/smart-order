/*
Copyright (c) 2016 ywesee GmbH, created by ML <cybrmx@gmail.com>

This file is part of AmikoRose.

AmiKoWeb is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package modules;

import com.google.inject.AbstractModule;

/**
 * Created by maxl on 26.06.2016.
 */
public class OnStartModule extends AbstractModule {

    @Override
    protected void configure() {
        /* Create objects eagerly when the application starts up...
           and not lazily when they are needed
        */
        bind(OnStartTasks.class).asEagerSingleton();
        bind(OnFileWatch.class).asEagerSingleton();
    }
}
