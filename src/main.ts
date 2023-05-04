/// <reference types="node" />
import yargs from 'yargs'
import { hideBin } from 'yargs/helpers'
import { Interpreter } from "./utils/interpreter.js";
import { argv } from 'process';
import chalk from "chalk";
import Utils from './misc/utils.js';
import { Builder } from './utils/builder.js';
import { Debug, Severity, logFile, logPath } from './misc/debug.js';
import { AvailablePlugins, Sources } from './misc/types.js';
import path from 'path';

yargs(hideBin(argv))
    .command("build", 'Build provied .ds file into a Synthetic Data Generator', () => { }, (_argv) => {
        if (_argv._[1] == null) process.exit();
        let filePath: string = _argv._[1] as string;
        if (!Utils.IsValidDSFile(filePath)) fail(`${filePath} is not a valid .ds file`);
        build(filePath, (_argv.verbose as boolean || _argv.vb as boolean))
    })
    .command("test", 'Outputs the parsed code into a json file for testing purposes', () => { }, (_argv) => {
        if (_argv._[1] == null) process.exit();
        let filePath: string = _argv._[1] as string;
        if (!Utils.IsValidDSFile(filePath)) fail(`${filePath} is not a valid .ds file`);
        test(filePath)
    })
    .command("plugins", 'Returns the list of available plugins', () => {}, (_argv) => {
        Debug.WriteLine(Utils.ListEnum(AvailablePlugins), Severity.Info, Sources.Core);
    })
    .option('execute-after', {
        alias: 'exafter',
        describe: 'Execute the generator after build it',
        implies: "build",
        conflicts: "test",
    })
    .option('verbose', {
        alias: 'vb',
        describe: 'Get detailed log on the building process',
        conflicts: "test"
    })
    .conflicts("build", "test")
    .conflicts("verbose", "test")
    .fail((msg, err, _yargs) => {
        Debug.WriteLine(msg, Severity.Error, Sources.Core)
    })
    .parse()

function fail(reason: string) {
    Debug.WriteLine(chalk.red(reason), Severity.Error, Sources.Core);
    Debug.WriteLine(`Log file : "${path.resolve(logPath, logFile)}"`, Severity.Warning, Sources.Core);
    process.exit(1);
}


function test(filePath: string) {
    const interpreter: Interpreter = new Interpreter(true);
    interpreter.Interpret(filePath);
    interpreter.Test();
}

function build(filePath: string, verbose: boolean) {
    const builder: Builder = new Builder(filePath, verbose);
    builder.Build();
    Debug.WriteLine(`Log file : "${path.resolve(logPath, logFile)}"`, Severity.Warning, Sources.Core);
}