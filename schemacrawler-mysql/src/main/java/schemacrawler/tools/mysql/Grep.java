/* 
 *
 * SchemaCrawler
 * http://sourceforge.net/projects/schemacrawler
 * Copyright (c) 2000-2007, Sualeh Fatehi.
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 */
package schemacrawler.tools.mysql;


import schemacrawler.tools.grep.GrepCommandLine;
import schemacrawler.tools.grep.GrepMain;
import sf.util.CommandLineUtility;

/**
 * Main class that takes arguments for grep-ping table and columns in a
 * schema.
 */
public final class Grep
{

  /**
   * Get connection parameters, and creates a connection, and crawls the
   * schema.
   * 
   * @param args
   *        Arguments passed into the program from the command line.
   */
  public static void main(final String[] args)
  {
    CommandLineUtility.checkForHelp(args,
                                    "/schemacrawler-mysql-grep-readme.txt");
    CommandLineUtility.setLogLevel(args);

    try
    {
      final GrepCommandLine commandLine = new GrepCommandLine(args,
                                                              "/schemacrawler.config.properties");
      GrepMain.grep(commandLine);
    }
    catch (final Exception e)
    {
      e.printStackTrace();
    }
  }

  private Grep()
  {
    // Prevent instantiation
  }

}
