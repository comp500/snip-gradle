package link.infra.snip.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.tasks.*;
import org.gradle.work.InputChanges;

@CacheableTask
public abstract class CompileTask extends DefaultTask {
	@PathSensitive(PathSensitivity.RELATIVE)
	@InputDirectory
	public SourceDirectorySet sourcesDir;

	@PathSensitive(PathSensitivity.RELATIVE)
	@InputDirectory
	public DirectoryProperty wikiSourcesDir;

	@OutputDirectory
	public DirectoryProperty outputDir;

	@TaskAction
	public void doTask(InputChanges inputChanges) {

	}
}
