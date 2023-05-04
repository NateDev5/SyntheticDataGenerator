import chalk from "chalk";
import moment from "moment";
import { Sources } from "./types.js";
import { appendFileSync, existsSync, mkdirSync, writeFileSync } from "fs";
import path from "path";

export const logPath = "./dist/bin/logs/";
export let logFile =  `log_build_${process.pid}.txt`;

export enum Severity {
    Info,
    Verbose,
    Warning,
    Error,
    FatalError
}

export class Debug {
    public static WriteLine(message: any, severity: Severity, source?: Sources, showTime: boolean = true, infoGreen: boolean = true) {
        if(!existsSync(logPath)) mkdirSync(logPath);
        let title = Severity[severity];
        let time: any = "";
        let _source = source || "";
        let color: chalk.Chalk = chalk.blue;
        let cleanMessage = message;
        switch (severity) {
            case Severity.Info:
                color = chalk.blue;
                if(infoGreen)
                    message = chalk.green(message);
                break;
            case Severity.Warning:
                color = chalk.yellow;
                break;
            case Severity.Error:
                color = chalk.red;
                break;
            case Severity.FatalError:
                color = chalk.redBright;
                break;
            case Severity.Verbose:
                color = chalk.yellowBright;
                message = chalk.cyan(message);
            default:
                break;
        }
        if(_source != "")
            _source = ` (${source})`

        if(showTime) 
            time = ` [${moment(new Date()).format("HH:mm:ss")}]`;
    
        let out: string = color(`[${title}]${time}` + _source + " ") + message;
        let outClean: string = `[${title}][${moment(new Date()).format("HH:mm:ss")}] ${_source} ${cleanMessage}\n`;
        console.log(out);
        appendFileSync(path.join(logPath, logFile), outClean);
    }
}